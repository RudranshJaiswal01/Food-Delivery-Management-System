# Food Delivery Management System

## Problem Statement

Imagine that you have been given the task of managing the food delivery network of a restaurant RoofTop in New York. You need to help them deliver the orders to their customers by assigning the delivery boys to each order.

Assume that the city consists of N customers who want to order their lunch today from RoofTop. You have a total of M drivers and need to cater to the customers ordering food. Each customer has two parameters associated with them, O and T, denoting the time at which a customer orders a meal and the travel time from RoofTop restaurant to the destination of this particular customer. Each delivery boy can only deliver one order at a time and as soon as the delivery boy gets free, he must start delivering other orders.

The lowest index delivery boy must be allocated first for the delivery. The status of the delivery boy while delivering the order should be "Busy". If all the delivery boys are busy at the time of order placement then show the message "No Food :-(".

---

## Annotations

- N - Number of Customer Orders (The customers are enumerated from C1, C2 to CN)
- M - Number of Delivery Boys (The drivers are enumerated from D1, D2 to DM)
- O - Order Placement Time
- T - Travel Time from Restaurant to Customer

---

## Example Input

Total Number of Customer Orders (N) - 6  
Total Number of Drivers (M) - 2  

(O, T) pairs:

1,10  
4,20  
15,5  
22,20  
24,10  
25,10  

Example Input Line:

6,2  
1,10  
4,20  
15,5  
22,20  
24,10  
25,10  

---

## Example Output

C1 - D1  
C2 - D2  
C3 - D1  
C4 - D1  
C5 - D2  
C6 - No Food :-(

---

## Implementation Details

This project implements the above problem statement using Java.

### Features

- Driver allocation based on availability
- Lowest indexed driver assigned first
- Chronological order processing of customer orders
- Handles overlapping delivery times
- Prints "No Food :-(" if no driver is available

---

## Project Structure
```
Food-Delivery-Management-System/
 ├── src/
 │    ├── Customer.java
 │    ├── Driver.java
 │    ├── DeliveryService.java
 │    └── Main.java
 ├── database.sql
 └── README.md
```
---

## How to Run

Compile the project:
```
javac src/*.java
```
Run the program:
```
java -cp src Main
```
---

## Input Format (Program)

The program accepts comma-separated input as follows:

N,M  
O,T  
O,T  
...  

Example:

6,2  
1,10  
4,20  
15,5  
22,20  
24,10  
25,10  

---

## Database

The database.sql file contains the schema for:

- drivers
- customers
- assignments

This structure supports persistence of data in a relational database.

---

## Author

Rudransh Jaiswal