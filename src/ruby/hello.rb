class Person
  attr_accessor :name, :age
end

p = Person.new
p.name = 'Christen'
p.age = 36
puts p.name
puts p.age