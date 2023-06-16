import { NgModule } from "@angular/core";
import { CarrosListComponent } from "./carro.component";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";

@NgModule({
    declarations: [
        CarrosListComponent
    ],
    imports:[
        CommonModule,
        FormsModule,
        RouterModule.forChild([
            {
                path:'carro',component: CarrosListComponent
            }
        ])
    ]
})
export class CarroModule{

}