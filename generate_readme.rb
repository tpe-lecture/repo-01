#!/usr/bin/env ruby

def parse_dir(dir, topic)

  content = ""

  content << "# #{topic}\n\n"
  count = 1

  Dir.foreach(dir) do |f|    
    if /[0-9][0-9][a,b]?_.*/ === f && !(/solution/ === f)
      readme = File.readlines("#{dir}/#{f}/readme.md")
      title = readme[0][/# Aufgabe: (.*)/, 1]
      content << "  #{count}. [#{title}](#{f})\n"
      count = count + 1
    end
  end

  File.open("#{dir}/readme.md", 'w') { |f| f.write(content) }

end


lines = File.readlines('readme.md', "\n", :encoding => 'UTF-8')
lines.each do |line|

  if /  [1-9][0-9]?\. / === line  
    dir = line[/\((.*)\)/, 1]
    topic = line[/\[(.*)\]/, 1]

    parse_dir(dir, topic)
  end
end
