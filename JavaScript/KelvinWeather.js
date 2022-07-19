const kelvin = 275
// Asignamos el valor constante a la variable kelvin
const celsius = kelvin - 273
// Asignamos el valor constante de la variable celsius
let fahrenheit = celsius * (9/5) + 32
fahrenheit = Math.floor (fahrenheit)
// Asignamos el valor de la variable y redondeamos su valor
console.log(`The temperature is ${fahrenheit} degrees Fahrenheit`)

let newton = celsius + (33/100)
newton = Math.floor(newton)
console.log(`The temperature is ${newton} degrees Newton`)