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
