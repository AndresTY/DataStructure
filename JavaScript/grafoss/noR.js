var nodo = /** @class */ (function () {
    function nodo(_name, _info) {
        this.name = _name;
        this.info = _info;
    }
    nodo.prototype.toString = function () {
        return "[" + this.name + "|" + this.info + "]";
    };
    return nodo;
}());
var grafo = /** @class */ (function () {
    function grafo() {
        this.j = 0;
        this.arr = [new nodo("a", 1), new nodo("b", 2), new nodo("c", 3), new nodo("d", 4), new nodo("e", 5)];
    }
    grafo.prototype.agregar = function (i, dato, name) {
        var p = new nodo(name, dato);
        if (this.isEmpty(i - 1)) {
            this.arr[i - 1] = p;
        }
        else {
            var aux = this.arr[i - 1];
            while (aux.conect != null) {
                aux = aux.conect;
            }
            aux.conect = p;
        }
    };
    grafo.prototype.isEmpty = function (i) {
        return this.arr[i] == null;
    };
    grafo.prototype.imprimir = function (a) {
        if (a.conect == null) {
            return "" + a;
        }
        else {
            return a + " -> " + this.imprimir(a.conect);
        }
    };
    grafo.prototype.listar = function () {
        var _this = this;
        this.arr.forEach(function (a) { return console.log(_this.imprimir(a)); });
    };
    return grafo;
}());
var a = new grafo();
for (var i = 1; i < 6; i++) {
    var x = Math.floor(Math.random() * (6 - 1)) + 1;
    a.agregar(x, i, "");
}
a.listar();
