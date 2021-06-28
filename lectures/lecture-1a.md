# Lecture 1A

> https://www.youtube.com/watch?v=-J_xL4IGhJA&t=442s


## How to learn a programming language?

Ask three questions:

1. What are the primitive elements?
2. What are the means of combination?
3. What are the means of abstraction?

Effectively:

1. What does the language come with?
2. How do we put those things together? That allow you to take the primitive elements and make bigger things out of them?
3. How do we name these complex things, as if they were primitive elements and so on?

Parentheses in LISP allow us to write out a tree in a linear text string

(+ 3 4 8)

is actually in a tree like:

```
█─`+` 
├─█─`+` 
│ ├─3 
│ └─4 
└─8 
```

Here the primitives are numbers, like, 3, 4, and 8, and operators like `+`

They can be combined like so:


```
(+ 3 4 8)
```

## Abstraction

In LISP you use `DEFINE` as the means of abstraction.

e.g.,

```
(DEFINE A (* 5 5))
(* A A)
(DEFINE B (+ A (* 5 A)))
B
(+ A (/ B 5))
```

Would return:

```
A
625
B
150
55
```

This is neat, we can define these objects, but what if we want to name the _general idea_ of multiplying something by itself?

```
(* 5 5)
(* 8 8)
```

You can use `DEFINE` again:

```
(DEFINE (SQUARE X) (* X X))
(SQUARE 10)
```

would return

```
SQUARE
100
```


> Syntactic sugar means having somehwat more surface forms for typing something.

These two are the same thing:

```
(DEFINE (SQUARE X) (* X X))
(DEFINE SQUARE (LAMBDA (X) (* X X)))
```

When we use `DEFINE` , we are naming a procedure, and we don't have to do the `LAMBDA` bit, because LISP abstracts that away for us.

When you put the parentheses around the thing tells you that you are defining a procedure:

A procedure:
```
(DEFINE (SQUARE X) (* X X))
```

A symbol

```
(DEFINE SQUARE (LAMBDA (X) (* X X)))
(DEFINE A (* 5 5))
```

To take this further

```
(DEFINE A (* 5 5))
(DEFINE (D) (* 5 5))
A --> 25
D --> COMPOUND PROCEDURE D
(D) --> 25
(A) --> ERROR
```

## Part 3

Approximating a square root of x

* Make a guess, G
* Improve the guess by averaging G and X/G
* Keep improving the guess until it is good enough
* Use 1 as an initial guess

LISP allows for recursive definitions. Which means you can do really
cool things!

"Block procedure" is a way of wrapping up your functions so they are inside the original function definition - so you don't pollute the environment/NAMESPACE.

