const url = "https://dog.ceo/api/breeds/image/random";
const imagen = document.getElementById('imagenPerrito');
const imagen2 = document.getElementById('imagenPerrito2');


// PROMESAS
fetch(url).
    //COnvertir los datos en formato JSON
    then(respuesta => respuesta.json()).
    // Imprimir los datos ya formateados
    then(datos => {
        // console.log(datos.message);
        imagen.src = datos.message
    })

// FUNCION ASYNC
async function obtenerPerrito(){
    // Esperar a que se haga la petición
    const inforPerritos = await fetch(url);
    // Esperamos ya que el metodo JSON es asincrono
    const perrito = await inforPerritos.json();
    // Asignamos el link de la imagen al atributo src
    imagen2.src = perrito.message;

}

obtenerPerrito();


