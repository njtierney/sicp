Understand how particular patterns of procedures and expressions cause particular patters of execution, behaviours, from the processors

How do we understand how these procedures are done by the computer:

e.g.,

```
(DEFINE (SOS X Y)
  (+ (SQ X) (SQ y)))
(DEFINE (SQ X)
  (* X X))
```

So

```
(SOS 4 3)
25
```

# The Substitution model

## Kinds of Expressions

- Numbers
- Symbols
- Lambda Expressions
- Definitions
- Conditionals
- Combinations

## The Substitution Rule

To evaluate an application:

- Evaluate the **operator** to get procedure
- Evaluate the **operands** to get arguments
- Apply the **procedure** to the arguments
  - Copy the body of the procedure
    - Substituting the arguments supplied for the formal parameters of the procedure
  - Evaluate the resulting new body.

e.g.,

```
(SOS 3 4)
```

Reduction step

```
(+ (SQ 3) (SQ 4))
```

Then

```
(+ (SQ 3) (* 4 4))
```

Then

```
(+ (SQ 3) 16)
(+ (* 3 3 ) 16)
(+ 9 16)
25
```

So, this isn't technically _exactly_ how this works inside the computer, but this is a useful way to think about things.

## Looking closer at "IF"

```
(IF <predicate>
    <consequent>
    <alternative>)
```

To evaluate an IF expression:

- Evaluate the predicate expression
  - If it yields TRUE
    - evaluate the consequent expression
  - otherwise
    - evaluate the alternative expression
    

```
(DEFINE (+ X Y)
  IF (= X 0)
     Y
     (+ (-1+ X) (1+ Y)))
```

Wow, that's a really neat way of doing addition!

Quote:

> The key to understanding complicated things is to know what not to look at, what not to compute, and what not to think.

> It's important to get names for things. One of the things a sorcerer will tell you is that if you know the name of a thing, we have power over it.

# Start of second segment

Can you imagine in your mind the resulting image of an image taken with a camer

So, we try and understand how we can add two numbers together in some different ways.

The first way:

```
(DEFINE (+ X Y)
  (IF (= X 0)
       Y
       (+ (-1+ X)(1+ Y))))
```

```
(+ 3 4)
```

This becomes...

```
(+ 2 5)
(+ 1 6)
(+ 0 7)
7
```

But the other program is a bit different:


```
(DEFINE (+ X Y)
  (IF (= X 0)
      Y
      (1+ (+ (-1+ X) Y))))
```

So:

```
(+ 3 4)
(1+ (+ 2 4))
(1+ (1+ (+ 1 4)))
(1+ (1+ (1+ (+ 0 4))))
(1+ (1+ (1+ 4)))
(1+ (1+ (5)))
(1+ (6))
(7)
```

Wow! So this is so neat, the shapes of these two problems are different.

Oh dang. So how do we evaluate these.

The first one is:

A Linear Iteration:
time = O(X)
space = O(1)

The second one is quite different!

A Linear Recursion
time = O(X)
space = O(X)

It is proportional to the input argument in both time and space

So now we can have iterative and recursive definitions.

Recursion defers the computation to later

# Part Three - text selection

Fibonacci Numbers

n = 1 2 2 3 4 5 6 7  8  9  10
v = 0 1 1 2 3 5 8 13 21 34 53 

So, given an `n` - can we calculate the fibonacci sequence

```
(DEFINE (FIB N)
  IF (< N 2)
     N
     (+ (FIB (- n 1))
        (FIB (- n 2))))
```

```
(FIB 4)
|-(FIB (3))
  |-(FIB (2))
    |-(FIB (1))
      |-(FIB (0))
  |-(FIB (1))
    |-(FIB (0))
|-(FIB (2))
  |-(FIB (1))
    |-1
  |-(FIB (0))
    |-0
```

This thing takes forever, and repeats itself, there 

time = O(fib(n)) (it grows exactly as fibonnaci)
space = O(n) (it grows according to the number of n provided)

### Tower of Hanoi

```
(DEFINE (MOVE N FROM TO SPARE)
  (COND ((= N 0) "DONE")
        (else
         (MOVE (-1+ N) FROM SPARE TO)
         (PRINT -MOVE FROM TO)
         (MOVE (-1+ N) SPARE TO FROM))))
```

So the general way of making these kinds of moves is a tree, so it is similar to the fibonnaci process.

(MOVE 4 1 2 3)
(MOVE 3 1 3 2) ...
(MOVE 2 1 2 3) ...
(MOVE 1 1 3 2) ...

SO this is exponential...

Is there a way to write this in a way that doesn't break it into two sub problems
...

Is it possible to write it out in a way that is iterative?



quotes:

> The way you construct a recursive process if by wishful thinking - you have to _believe_
