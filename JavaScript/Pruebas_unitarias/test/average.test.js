const {average} = require('../prueba');

test('Ingresar un solo valor', () => {
  const resultado = average([1]);
  //Comparación
  expect(resultado).toBe(1);
})

test('Ingresar un solo valor', () => {
  //Comparación
  expect(average([1, 2, 3, 4, 5, 6])).toBe(3.5);
})