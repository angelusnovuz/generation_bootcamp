const idInfo = window.location.href.split('=').pop();
const imagenPortada = document.getElementById('imagenPortada');
const infoAnime = document.getElementById('infoAnime');
const urlID = `https://api.jikan.moe/v4/anime/${idInfo}`;
// console.log(idInfo);

fetch(urlID).
    then(resp => resp.json()).
    then(datos => {
        // console.log(datos.data);

        const datosNecesarios = {
            nombre: datos.data.title,
            imagen: datos.data.images.jpg.large_image_url,
            id: datos.data.mal_id,
            sinopsis: datos.data.synopsis
        }
        // console.log(datosNecesarios);
        
        const templateImg = `
        <img class="img-fluid" src="${datosNecesarios.imagen}" alt="">
        `
        imagenPortada.innerHTML = templateImg

        const templateInfo = `
        <h1>${datosNecesarios.nombre}</h1>
        <p>${datosNecesarios.sinopsis}</p>
        <div class="favorito">
            <button id="agregarFavoritos" type="button" class="btn btn-dark">Agregar a favoritos</button>
        </div>
        `
        infoAnime.innerHTML = templateInfo


    const agregarFavoritos = document.getElementById('agregarFavoritos')
    console.log(agregarFavoritos);

    agregarFavoritos.addEventListener('click', () => {
        // console.log('Agregado');

        const datos = {
            id:datosNecesarios.id,
            nombre:datosNecesarios.nombre,
            imagen:datosNecesarios.imagen
        }
        // console.log(datos);

        // AGREGAR ELEMENTOS A LOCALSTORAGE

        if (localStorage.getItem("favoritos")) {
            // Si ya existe no hacemos nada
            console.log("Existe elemento");
            const favoritos = JSON.parse(localStorage.getItem("favoritos"));
            favoritos.push(datos)

            localStorage.setItem("favoritos", JSON.stringify(favoritos));
            window.
        }else{
            // Si no existe creamos un arreglo para agregar los nuevos datos
            console.log("No hay elemento");
            const favoritos = []
            favoritos.push(datos)
            localStorage.setItem("favoritos", JSON.stringify(favoritos));
        }

        //Obtener lo que este guardado
        // JSON.parse(localStorage.getItem("favoritos"));

        // guardar en localstorage. tenemos que transformar los datos a string
        // localStorage.setItem("favoritos", JSON.stringify(favoritos));
    })
})




