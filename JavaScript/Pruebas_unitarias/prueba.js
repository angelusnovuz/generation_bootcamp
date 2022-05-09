const palindormo = (string) => {
  if(typeof string === 'undefined') return;

  return string.split('').reverse().join('')

}

const average = array => {
  let suma = 0;
  array.forEach(num => { suma += num});
  return suma / array.length;
}

// EXPORTAR
module.exports = {
  palindormo : palindormo,
  average : average
}