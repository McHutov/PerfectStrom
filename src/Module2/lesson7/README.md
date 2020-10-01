1)What is the parent class of all classes?

Object

-------------------------------------
2) How do I call the constructor of the parent class?

super()

-------------------------------------
3)Will the parent class constructor be called automatically?

Yes, if it is default constructor

-------------------------------------
4)Will the parent class constructor be automatically called with arguments?

Must be called with super()
 
-------------------------------------
5)Can interface type be used for polymorphism?
Yes

There are the following classes:

---
class A {

}

class B extends A {

}

class C extends B {

}

---
Is it possible to do this?

B b = new A(); No

-----------------------
Is it possible to do this?

B b = new B(); Yes

-----------------------
Is it possible to do this?

B b = new C(); Yes

-----------------------

Is it possible to do this?

Object obj = new A();

Object obj1 = new B();

Object obj2 = new C(); Yes

-----------------------