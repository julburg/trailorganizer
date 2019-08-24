import store from "../store";

export function allTrails() {
    const request = new XMLHttpRequest();
    request.open("GET", "/trails");
    request.addEventListener('load', function (event) {
        if (request.status >= 200 && request.status < 300) {
            store.dispatch("trails",request.responseText);
        } else {
            console.log(request.statusText);
        }
    });
    request.send();
}
