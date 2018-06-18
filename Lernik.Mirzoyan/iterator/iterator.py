'''@author Lernik Mirzoyan'''
class Person:
    def __init__(self, name, children):
        self.name = name
        if children is not None:
            self.children = children
        else:
            self.children = []
        self.iterChildren = self.children
    def __iter__(self):
   		return self

    def next(self):
        if len(self.iterChildren) > 0:
            tempChildren = []
            for child in self.iterChildren:
                tempChildren.extend(child.children)
            self.iterChildren, tempChildren = tempChildren, self.iterChildren
            return tempChildren
        else:
            self.iterChildren = self.children
            raise StopIteration()
            

secondPosterity1 = [
	Person("second posterity, Person 1", None), 
	Person("second posterity, Person 2", [
	    Person('third posterity, Person 1', [
	        # Person('fourth posterity, Person 1', [])
	    ])
	]), 
	Person("second posterity, Person 3", None)
]

secondPosterity2 = [
	Person("second posterity, Person 4", None), 
	Person("second posterity, Person 5", None), 
	Person("second posterity, Person 6", None)
]

firstPosterity = [
	Person("first posterity, Person 1", secondPosterity1),
	Person("first posterity, Person 1", secondPosterity2)
]

person = Person("Vardges", firstPosterity)
i = 0;

for children in person:
    i += 1;
    print("Posterity " + str(i))
    for child in children:
        print(child.name)
print('\n') 
i = 0;
for children in person:
    i += 1;
    print("Posterity " + str(i))
    for child in children:
        print(child.name)
