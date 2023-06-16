import { Component } from "@angular/core";
import { Carro } from "./carro";
import { CarroService } from "./carro.service";

@Component({
    templateUrl: 'carro-new.component.html'
})
export class CarronewComponent{
    
    carro: Carro = new Carro()

    constructor(private carroService: CarroService){}

 
    save() : void{
        this.carroService.save(this.carro)
        .subscribe({
            next: carro => console.log("produto salvo: ",carro),
            error: err => console.log("Error: "+err)
        })
    }
}