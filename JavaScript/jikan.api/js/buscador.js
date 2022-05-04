const formulario = document.querySelector("form");

formulario.addEventListener("submit", (e) => {
    e.preventDefault();
    console.log("boton presionado");

    const busqueda = document.querySelector("input")
    console.log(busqueda);

    // Pasamos la infromacion del input a otro archivo html
    window.location.href = `busqueda.html?nombre=${busqueda}`
})