import { NgModule } from "@angular/core";
import { NavbarComponent } from "./component/navbar/nav-bar.component";
import { RouterModule } from "@angular/router";

@NgModule({
    declarations: [
        NavbarComponent
    ],
    imports:[
        RouterModule
    ],
    exports:[
        NavbarComponent
    ]
})
export class CoreModule{}