// Se ejecuta despues de cierto tiempo (loop)

// let tiempo = 5000;
// setInterval(() => {
//     let datos = "Angel";
//     console.log(datos);
// }, tiempo);

// console.log("Hola");


const datos = [
    {
        nombre: "Angel",
        edad: 23
    },
    {
        nombre: "Juan",
        edad: 23
    },
    {
        nombre: "Saul",
        edad: 23
    }
]


// CODIGO ASINCRONO
function obtenerDatos (){
    return new Promise ((resolve, reject) => {
        // Esperar 3 segundos para retornar los datos
        setTimeout(()=> {
            resolve (datos)
        }, 3000)
    })
}

// console.log(obtenerDatos());

// una vez realizada la promesa(realizar esto)
// obtenerDatos().then((datos) => {
//     console.log(datos);
// })


// FUNCION ASINCRONA
async function obtenerDatosAsync (){
    // Va obtener los datos obtenidos de la funcion anterior
    // Tiene que esperar hasta que se cumpla para retornar los datos
    const datosObtenidos = await obtenerDatos();
    console.log(datosObtenidos);
}

obtenerDatosAsync()





