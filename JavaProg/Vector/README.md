This exercise concerns the construction of a Java class to represent a vector in two dimensions. A
vector has magnitude and direction. The following is a graphical depiction of a vector.
A vector can be represented by its horizontal and vertical components i.e. 𝑣 = (𝑣𝑥, 𝑣𝑦).
There are a number of operations that can be performed on vectors:

Operation Description
Obtain magnitude The magnitude of a vector 𝑣 = (𝑣𝑥, 𝑣𝑦) is √𝑣𝑥2 + 𝑣𝑦2
Vector add
Given two vectors 𝑣 = (𝑣𝑥, 𝑣𝑦) and 𝑣′ = (𝑣𝑥′ , 𝑣𝑦′ ), the result of
adding them together is the vector (𝑣𝑥 + 𝑣𝑥′ , 𝑣𝑦 + 𝑣𝑦′ ).
Scalar Multiply
The multiplication of a vector 𝑣 = (𝑣𝑥, 𝑣𝑦) by a value 𝑚 produces a
vector 𝑣′ = (𝑚𝑣𝑥, 𝑚𝑣𝑦).
Dot product
Given two vectors 𝑣 = (𝑣𝑥, 𝑣𝑦), and 𝑣′ = (𝑣𝑥′ , 𝑣𝑦′ ), their dot product
is the value of 𝑣𝑥 × 𝑣𝑥′ + 𝑣𝑦 × 𝑣𝑦′ 

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
𝑣𝑦
𝑣 𝑣𝑥Version 08/09/2021 21:22
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
