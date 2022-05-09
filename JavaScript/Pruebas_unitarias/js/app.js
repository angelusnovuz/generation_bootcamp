const suma = (a, b) =>{
  return a - b;
}

console.log();

const arr = [
  {a:1, b:3, resultado:4},
  {a:0, b:0, resultado:0},
  {a:5, b:5, resultado:10},
  {a:10, b:30, resultado:40}
]



console.assert(
  suma(1, 3) === 4,
  'El resultado de las suma de 1 y 3 deber ser 4'
)