#By Louie + Adil created on 4/22/2017

Definition from Notes: The Visitor Pattern Allows for one or more operation to be applied to a set of objects at
runtime, decoupling the operations from the object structure. The visitor pattern can therefore provide additional
functionality to a class without changing it. So it can be very beneficial to use this pattern if you need to perform
operations across a dispate set of objects. The Visitor pattern was also a pattern in the original Gang Of Four (GoF).

Example of Visitor Pattern: Louie decides that he wants to do some online grocery shopping from the comfort of his own
home. The online shopping cart functions in that he can add different types of items (known as Elements). When he clicks
on the checkout button, it will calculate the total amount to be paid. So we can have the calculation login in the item
classes, or you can move it to another class by simply using the Visitor Pattern. This could be done by first creating
different types of items to be used in the shopping cart. Then you can create concrete classes like price, ISBN #, a
Fruit class that weighs the fruit, etc. You can implement the visitorImple class that will take all those concrete
classes into affect to calculate the cost. This way during runtime the visitorImple class will be doing the logic i
nstead of each concrete class calculating the cost.

#Supporting Document(s):

https://dzone.com/articles/design-patterns-visitor Great resource with the original example about the Taxis from class.
 Also has a nice diagram that helps visualize the pattern.

https://www.youtube.com/watch?v=Qy9eFruqcjw Great overview and informational talk about the Visitor Pattern. Although
it may be too advanced for some stuff in this class (for example different Sub-types of visitor patterns.) But the
implementation of the pattern was helpful, along with the coding example of a visitor pattern in use.

https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm Good short summary along with steps on how to
implement the pattern with a unique example of parts to a computer which I've never seen before.