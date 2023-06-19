import { NgModule } from "@angular/core";
import { CarrosListComponent } from "./carro.component";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { CarroinfoComponent } from "./carro-info.component";
import { CarronewComponent } from "./carro-new.component";
import { AppPipeModule } from "../shared/pipe/app-pipe.module";

@NgModule({
    declarations: [
        CarrosListComponent,
        CarroinfoComponent,
        CarronewComponent
    ],
    imports:[
        CommonModule,
        AppPipeModule,
        FormsModule,
        RouterModule.forChild([
            {
                path:'carros',component: CarrosListComponent
            },
            {
                path: 'carros/info/:id', component: CarroinfoComponent
            },
            {
                path:'carro/new', component: CarronewComponent
            }
        ])
    ]
})
export class CarroModule{

}