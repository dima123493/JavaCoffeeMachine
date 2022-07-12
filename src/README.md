# Coffee Machine

What can be better than a cup of coffee during a break? A coffee that you don’t have to make yourself. It’s enough to
press a couple of buttons on the machine, and you get a cup of energy; but first, we should teach the machine how to do
it. In this project, I have worked on programming a coffee machine simulator. The machine works with typical products:
coffee, milk, sugar, and plastic cups; if it runs out of something, it shows a notification. You can get three types of
coffee: espresso, cappuccino and latte. Since nothing’s for free, it also collects the money.

## Work on project. Stage 1/6: Making coffee

###### Description

Let's start with a program that makes a coffee – virtual coffee, of course. But in this project, I will implement
functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans, it can make
different varieties of coffee, and it can take the money for making a coffee.

The first version of the program just makes a coffee. It prints to the standard output what it is doing as it makes a
coffee.

###### Instruction

Write a program that prints the steps necessary to make coffee.

###### Example

Write the program that prints all lines as in the example below.

```
Starting to make a coffee  
Grinding coffee beans  
Boiling water  
Mixing boiled water with crushed coffee beans  
Pouring coffee into the cup  
Pouring some milk into the cup  
Coffee is ready!  
```

## Work on project. Stage 2/6: Ingredient calculator

###### Description

Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of
guests. The program should calculate how much water, coffee, and milk are necessary to make the specified amount of
coffee. One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.

The user should input the amount of coffee he needs, in cups, for all the guests.

Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any
coffee.

###### Instruction

Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

###### Examples

The greater-than symbol followed by a space (-> ) represents the user input. Note that it's not part of the input.

###### Example 1: an example of the program

```
Write how many cups of coffee you will need:  
-> 25  
For 25 cups of coffee you will need:
5000 ml of water  
1250 ml of milk  
375 g of coffee beans  
```

###### Example 2: an example of the program

```
Write how many cups of coffee you will need:  
-> 125  
For 125 cups of coffee you will need:
25000 ml of water  
6250 ml of milk  
1875 g of coffee beans
```

## Work on project. Stage 3/6: Estimate the number of servings

###### Description

A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big
number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans
that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can
make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make
that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee
machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should
output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make
one cup of coffee.

###### Instruction

Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount
of ingredients.

###### Examples

The program should firstly request for water, then milk, then beans, and then the number of cups.
The symbol -> represents the user input. Note that it's not part of the input.

Example 1:

```
Write how many ml of water the coffee machine has:    
-> 300  
Write how many ml of milk the coffee machine has:  
-> 65 
Write how many grams of coffee beans the coffee machine has:  
-> 100  
Write how many cups of coffee you will need:  
-> 1  
Yes, I can make that amount of coffee  
```

Example 2:

```
Write how many ml of water the coffee machine has:  
-> 500  
Write how many ml of milk the coffee machine has:  
-> 250  
Write how many grams of coffee beans the coffee machine has:  
-> 200  
Write how many cups of coffee you will need:  
-> 10  
No, I can make only 2 cups of coffee  
```

Example 3:

```
Write how many ml of water the coffee machine has:  
-> 1550  
Write how many ml of milk the coffee machine has:  
-> 299  
Write how many grams of coffee beans the coffee machine has:  
-> 300  
Write how many cups of coffee you will need:  
-> 3  
Yes, I can make that amount of coffee (and even 2 more than that)
```

Example 4:

```
Write how many ml of water the coffee machine has:  
-> 0  
Write how many ml of milk the coffee machine has:  
-> 0  
Write how many grams of coffee beans the coffee machine has:  
-> 0  
Write how many cups of coffee you will need:  
-> 1 
No, I can make only 0 cups of coffee
```

Example 5:

```
Write how many ml of water the coffee machine has:  
-> 0  
Write how many ml of milk the coffee machine has:  
-> 0  
Write how many grams of coffee beans the coffee machine has:  
-> 0  
Write how many cups of coffee you will need:  
-> 0  
Yes, I can make that amount of coffee  
```

Example 6:

```
Write how many ml of water the coffee machine has:  
-> 200  
Write how many ml of milk the coffee machine has:  
-> 50  
Write how many grams of coffee beans the coffee machine has:  
-> 15  
Write how many cups of coffee you will need:  
-> 0  
Yes, I can make that amount of coffee (and even 1 more than that)
```

## Work on project. Stage 4/6: Buy, fill, take!

###### Description

Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups.
Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be
able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety
requires a different amount of supplies, except that all of them require only one disposable cup. Second, the coffee
machine should be able to get replenished by a special worker. Third, another special worker should be able to take
money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from the standard input, which can be "
buy", "fill", or "take". If you want to buy some coffee, input "buy". If you are a special worker, and you think that it
is time to fill up all the supplies for the coffee machine, input "fill". If you are another special worker, and it is
time to take the money from the coffee machine, input "take".

If the user writes "buy" then they must choose one of three varieties of coffee that the coffee machine can make:
espresso, latte, or cappuccino.

* For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
* For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
* And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs
  $6.

If the user writes "fill", the program should ask them how much water, milk, coffee, and how many disposable cups they
want to add to the coffee machine.

If the user writes "take" the program should give them all the money that it earned from selling coffee.

At the start, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable
cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee
machine’s state after that. Try to use methods to implement every action that the coffee machine can do.

###### Instruction

Write a program that offers to buy one cup of coffee, to fill up the ingredients, or to take its money. At the same
time, the program should calculate how many ingredients it has left. And also display the number of ingredients before
and after purchase.

###### Examples

An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3.
Options also should be named as "buy", "fill", "take".
The symbol -> represents the user input. Note that it's not part of the input.

Example 1:

```
The coffee machine has:  
400 ml of water  
540 ml of milk 
120 g of coffee beans  
9 disposable cups  
$550 of money

Write action (buy, fill, take):  
-> buy  
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:  
-> 3

The coffee machine has:  
200 ml of water  
440 ml of milk
108 g of coffee beans  
8 disposable cups  
$556 of money
```

Example 2:

```
The coffee machine has:  
400 ml of water 
540 ml of milk 
120 g of coffee beans 
9 disposable cups 
$550 of money

Write action (buy, fill, take):  
-> fill  
Write how many ml of water you want to add:  
-> 2000  
Write how many ml of milk you want to add:  
-> 500 
Write how many grams of coffee beans you want to add:  
-> 100 
Write how many disposable coffee cups you want to add:  
-> 10

The coffee machine has:  
2400 ml of water  
1040 ml of milk  
220 g of coffee beans  
19 disposable cups  
$550 of money
```

Example 3:

```
The coffee machine has:  
400 ml of water
540 ml of milk  
120 g of coffee beans  
9 disposable cups  
$550 of money

Write action (buy, fill, take):  
-> take  
I gave you $550

The coffee machine has:  
400 ml of water  
540 ml of milk
120 g of coffee beans  
9 disposable cups  
$0 of money
```

## Work on project. Stage 5/6: Keep track of the supplies

###### Description

But just one action isn’t interesting. Let's improve the program, so it can do multiple actions, one after another. The
program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what
the program did in the previous step. However, if the user wants to switch off the coffee machine, he should type "exit"
. Then the program should terminate. Also, when the user types "remaining", the program should output all the resources
that the coffee machine has. This means that you shouldn't show the remaining stock levels at the beginning/end of the
program.

Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough
resources to make coffee, the program should output a message that says it can't make a cup of coffee and state what is
missing.

And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his
mind, he should be able to type "back" to return into the main cycle.

Remember, that:

* For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
* For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
* And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

###### Instruction

Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is given.

###### Example

Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of
coffee beans, 9 disposable cups, $550 in cash).
The symbol -> represents the user input. Note that it's not part of the input.

Example 1:

```
Write action (buy, fill, take, remaining, exit):
-> remaining

The coffee machine has:
400 ml of water  
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): 
-> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:  
-> 2 
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):  
-> remaining

The coffee machine has:  
50 ml of water  
465 ml of milk
100 g of coffee beans 
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
-> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
-> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit):  
-> fill

Write how many ml of water do you want to add:  
-> 1000  
Write how many ml of milk do you want to add:  
-> 0  
Write how many grams of coffee beans do you want to add:  
-> 0  
Write how many disposable cups of coffee do you want to add:  
-> 0

Write action (buy, fill, take, remaining, exit):
-> remaining

The coffee machine has:  
1050 ml of water  
465 ml of milk
100 g of coffee beans 
8 disposable cups  
$557 of money

Write action (buy, fill, take, remaining, exit):  
-> buy  

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:  
-> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):  
-> remaining

The coffee machine has:  
700 ml of water  
390 ml of milk  
80 g of coffee beans  
7  disposable cups  
$564 of money

Write action (buy, fill, take, remaining, exit):  
-> take

I gave you $564

Write action (buy, fill, take, remaining, exit):  
-> remaining 

The coffee machine has:  
700 ml of water 
390 ml of milk  
80 g of coffee beans  
7 disposable cups  
$0 of money

Write action (buy, fill, take, remaining, exit):  
-> exit
```

## Work on project. Stage 6/6: Brush up your code

###### Description

Let's redesign our program and write a class that represents the coffee machine. The class should have a method that
takes a string as input. Every time the user inputs a line (a string) to the console, the program invokes this method
with one argument: the line that user input to the console. This system simulates pretty accurately how real-world
electronic devices work. External components (like buttons on the coffee machine or tapping on the screen) generate
events that pass into the single interface of the program.

The class should not use system input at all; it only should handle input that comes to it via this method and its
string argument.

The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can
do? If the user inputs a single number, how can the method determine what that number is: a variant of coffee chosen by
the user or the number of the disposable cups that a special worker added into the coffee machine?

The right solution to this problem is to store the current state of the machine. The coffee machine has several states
it can be in. For example, the state could be "choosing an action" or "choosing a variant of coffee". Every time the
user inputs something and a program passes that line to the method, the program determines how to interpret this line
using the information about the current state. After processing this line, the state of the coffee machine can be
changed or can stay the same. The most efficient way of handling states is using an enum with all predefined states.

Remember, that:

* For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
* For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
* And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

###### Instruction

Refactor the program. Make it so that you can communicate with the coffee machine through a single method.

###### Example

Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of
coffee beans, 9 disposable cups, $550 in cash).
The symbol -> represents the user input. Note that it's not part of the input.

```
Write action (buy, fill, take, remaining, exit):
-> remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit):
-> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
-> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
-> remaining

The coffee machine has:
50 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
-> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
-> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit):
-> fill

Write how many ml of water you want to add:
-> 1000
Write how many ml of milk you want to add:
-> 0
Write how many grams of coffee beans you want to add:
-> 0
Write how many disposable cups of coffee you want to add:
-> 0

Write action (buy, fill, take, remaining, exit):
-> remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
-> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
-> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
-> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit):
-> take

I gave you $564

Write action (buy, fill, take, remaining, exit):
-> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit):
-> exit
```