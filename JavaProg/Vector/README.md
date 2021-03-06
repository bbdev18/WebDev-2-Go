This exercise concerns the construction of a Java class to represent a vector in two dimensions. A
vector has magnitude and direction. The following is a graphical depiction of a vector.
A vector can be represented by its horizontal and vertical components i.e. π£ = (π£π₯, π£π¦).
There are a number of operations that can be performed on vectors:

Operation Description
Obtain magnitude The magnitude of a vector π£ = (π£π₯, π£π¦) is βπ£π₯2 + π£π¦2
Vector add
Given two vectors π£ = (π£π₯, π£π¦) and π£β² = (π£π₯β² , π£π¦β² ), the result of
adding them together is the vector (π£π₯ + π£π₯β² , π£π¦ + π£π¦β² ).
Scalar Multiply
The multiplication of a vector π£ = (π£π₯, π£π¦) by a value π produces a
vector π£β² = (ππ£π₯, ππ£π¦).
Dot product
Given two vectors π£ = (π£π₯, π£π¦), and π£β² = (π£π₯β² , π£π¦β² ), their dot product
is the value of π£π₯ Γ π£π₯β² + π£π¦ Γ π£π¦β² 

```java
Sample I/O:
Make a selection and press return:
(0) Quit, (1) Test getMagnitude(), (2) Test add()
(3) Test scalar multiply(), (4) Test dotProduct()
1
Enter x component and y component (separated by a space):
3 4
Created a Vector object with the given values for vx and vy.
Result of calling getMagnitude(): 5.00
Make a selection and press return:
(0) Quit, (1) Test getMagnitude(), (2) Test add()
(3) Test scalar multiply(), (4) Test dotProduct()
2
Enter x component and y component (separated by a space):
-3 3
Created Vector object: v = (-3.00, 3.00)
Enter x component and y component (separated by a space):
4 -4
Created Vector object: v = (4.00, -4.00)
Result of adding the vectors: v = (1.00, -1.00)
π£π¦
π£ π£π₯Version 08/09/2021 21:22
Page 5 of 5
Make a selection and press return:
(0) Quit, (1) Test getMagnitude(), (2) Test add()
(3) Test scalar multiply(), (4) Test dotProduct()
3
Enter x component and y component (separated by a space):
-3 3
Created Vector object: v = (-3.00, 3.00)
Enter multiplier:
.5
New Vector: v = (-1.50, 1.50)
Make a selection and press return:
(0) Quit, (1) Test getMagnitude(), (2) Test add()
(3) Test scalar multiply(), (4) Test dotProduct()
4
Enter x component and y component (separated by a space):
-3 3
Created Vector object: v = (-3.00, 3.00)
Enter x component and y component (separated by a space):
4 2
Created Vector object: v = (4.00, 2.00)
Result of dot product of the vectors: -6.0
```
