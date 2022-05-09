// IMPORTAR

const {palindormo} = require('../prueba')

test('palindromo usando undefined', () => {
  const resultado = palindormo('');
  //Comparación
  expect(resultado).toBe('');
})