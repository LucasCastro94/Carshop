import { NgModule } from "@angular/core";
import { CarrosListComponent } from "./carro.component";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { CarroinfoComponent } from "./carro-info.component";

@NgModule({
    declarations: [
        CarrosListComponent,
        CarroinfoComponent
    ],
    imports:[
        CommonModule,
        FormsModule,
        RouterModule.forChild([
            {
                path:'carros',component: CarrosListComponent
            },
            {
                path: 'carros/info/:id', component: CarroinfoComponent
            }
        ])
    ]
})
export class CarroModule{

}