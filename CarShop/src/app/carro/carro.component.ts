import { Component, OnInit } from "@angular/core";
import { Carro } from "./carro";
import { CarroService } from "./carro.service";

@Component({
    templateUrl:'./carro.component.html'
})
export class CarrosListComponent implements OnInit{
   
    filteredCarros: Carro [] = []

    _carros: Carro[] = []

    _filterBy:string

    constructor(private carroService: CarroService){}

    ngOnInit(): void {
        this._listAll()
    }

    _listAll() : void{
        this.carroService.listAll().subscribe({
            next: carros =>{
             this._carros = carros

             this.filteredCarros = this._carros
            },
            error: err => alert("Problema em listar todos carros")
        })
    }

    deleteById(carroId:number) : void{
        this.carroService.deleteById(carroId).subscribe({
            next: ()=> this._listAll(),
            error: err =>alert("Falha ao deletar")
        })    
    }

    set filter(value:string)
    {
        this._filterBy = value

        this.filteredCarros = this._carros.filter((carro:Carro)=>
        carro.modelo.toLowerCase().indexOf(this._filterBy.toLowerCase()) > -1 ||
        carro.marca.toLowerCase().indexOf(this._filterBy.toLowerCase()) > -1 ||
        carro.ano.toString().includes(this._filterBy))

    }

    get filter()
    {
        return this._filterBy
    }

}