import { NgModule } from "@angular/core";
import { NavbarComponent } from "./component/navbar/nav-bar.component";
import { RouterModule } from "@angular/router";
// import { Error404 } from "./component/404/error404.component";

@NgModule({
    declarations: [
        NavbarComponent
        // Error404
    ],
    imports:[
        RouterModule/*.forChild([{*/
        //         path:'**', component: Error404
        // }])
    ],
    exports:[
        NavbarComponent
    ]
})
export class CoreModule{}