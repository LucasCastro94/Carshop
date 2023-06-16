import { Component, OnInit } from "@angular/core";
import { Carro } from "./carro";
import { ActivatedRoute } from "@angular/router";
import { CarroService } from "./carro.service";

@Component({
    templateUrl: 'carro-info.component.html'
})
export class CarroinfoComponent implements OnInit{

    carro: Carro

    constructor(private activateRoute:ActivatedRoute, private carroService: CarroService){}

    ngOnInit(): void {
        
        this.carroService.findById(+this.activateRoute.snapshot.paramMap.get('id'))
        .subscribe({
            next: carro => this.carro = carro,
            error: err => console.log('ERROR: ',err)
        })
    }

    save() : void{
        this.carroService.save(this.carro)
        .subscribe({
            next: carro => console.log("produto salvo: ",carro),
            error: err => console.log("Error: "+err+"coco")
        })
    }
}