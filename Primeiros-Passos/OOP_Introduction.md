# Object-oriented Programming

Before the concept of OOP was created, the programs were a mess. A bunch of function connected, with so much interdependence between them, and sometimes even repeted (spathetti code).
In OOP we combine a group of related variables and fuctions into a unity called **object**

* **Objects**: A combination of related variables and functions
* **Property**: Variables
* **Methodes:** Funcions

------

### Encapsulation - 

To group all related proprieties. As such as a car has variables like color, size, model and methods like move(), stop(), park(), Your LocalStorage has length and removeItem() function.

Implementation 1 (withou POO):

```javascript
let baseSalary = 30000
let overtime = 10
let rate = 20

function getWage(baselary, overtime, rate) {
return baseSalary+ (overtime*rate)
}
```

> *Functions with a lot of proprieties

Implementation 2 (with POO)

```javascript
let employee = {
	baseSalary = 30000
  	overtime = 10
	rate = 20
	getWage: function() {
		return this.baseSalary+ (this.overtime*this.rate)
	}
}

employee.getWage()
```

> Functions with no Parameters
>
> `" The best functions are those with no parameters" ` 
>                                                                    Uncle Bob, Robert C Martin
>
> 

------

### Abstraction

"I dont care how it works if it works".
Its about abstract all the hard part, to hidden all the complexity, to Simplify the Interface and to Reduce the impact of changes



### Ineheritance

Mechanism that allows you to eliminate redundant code.

### Prolymorphism



