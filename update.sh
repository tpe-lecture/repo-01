#!/bin/sh

# Function to clone a repository
function clone {

    REPO_NAME=$1

    if [ ! -d "$REPO_NAME" ]; then
      git clone git@github.com:tpe-lecture/$REPO_NAME.git
    fi
}

# Function to update a repository with actual changes
function update {
    REPO_NAME=$1

    cd $REPO_NAME
    git pull origin master
    cd ..

 #   rsync --exclude=.git --delete --update -raz __template/02_junit_javadoc/ $REPO_NAME/02_junit_javadoc
#    rsync --exclude=.git --delete --update -raz __template/03_strukturierung/ $REPO_NAME/03_strukturierung
#    rsync --exclude=.git --delete --update -raz __template/04_objektorientierung/ $REPO_NAME/04_objektorientierung
#    rsync --exclude=.git --delete --update -raz __template/05_object_wrapper/ $REPO_NAME/05_object_wrapper
#    rsync --exclude=.git --delete --update -raz __template/06_ausnahmen/ $REPO_NAME/06_ausnahmen
#    rsync --exclude=.git --delete --update -raz __template/07_enumerationen/ $REPO_NAME/07_enumerationen
#    rsync --exclude=.git --delete --update -raz __template/08_generics/ $REPO_NAME/08_generics
    rsync --exclude=.git --delete --update -raz __template/09_geschachtelte_klassen/ $REPO_NAME/09_geschachtelte_klassen
    rsync --exclude=.git --delete --update -raz __template/10_collections/ $REPO_NAME/10_collections
    rsync --exclude=.git --delete --update -raz __template/11_streams/ $REPO_NAME/11_streams
    rsync --exclude=.git --delete --update -raz __template/12_threads/ $REPO_NAME/12_threads
    rsync --exclude=.git --delete --update -raz __template/13_io/ $REPO_NAME/13_io
    rsync --exclude=.git --delete --update -raz __template/lib/ $REPO_NAME/lib
#    rsync --exclude=.git --delete --update -raz __template/30_testate/ $REPO_NAME/30_testate
    cp __template/readme.md $REPO_NAME
    cp __template/workingsets.wst $REPO_NAME
    cp __template/.gitignore $REPO_NAME

    cd $REPO_NAME

    git add .
    git commit -m "I Robot"
    git push origin master
    cd ..
}

# Reduce workingsets
cat workingsets-full.wst | grep -v "^.*-solution.*$" > workingsets.wst

# Synchronize the template directory with this one
pushd ../../TPE_Repos
rsync --exclude=*-solution -a --delete ../TPE/11_Labs/ __template

# Loop repos and push changes
for REPO in {1..45}
do
    if [ "$REPO" -lt "10" ]
	then
    	NAME=repo-0$REPO
    else
    	NAME=repo-$REPO
    fi

    clone $NAME
    update $NAME
done

# Clean repo with all exercises
rsync --exclude=.git --delete --update -raz __template/ exercises
cd exercises
rm generate_readme.rb
rm update.sh
rm sync_projects.sh
git add .
git commit -m "Updated exercises"
git push origin master
cd ..

popd
