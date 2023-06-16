import { Component } from "@angular/core";
import { Carro } from "./carro";
import { CarroService } from "./carro.service";
import { Router } from "@angular/router";

@Component({
    templateUrl: 'carro-new.component.html'
})
export class CarronewComponent{
    
    carro: Carro = new Carro()

    constructor(private carroService: CarroService,private router:Router){}

 
    save() : void{
        this.carroService.save(this.carro)
        .subscribe({
            next: carro => {
                console.log("produto salvo: ",carro)
                this.router.navigateByUrl('carros')
        },
            error: err => console.log("Error: "+err)
        })
    }
}