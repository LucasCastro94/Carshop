import { NgModule } from "@angular/core";
import { MoneyPipe } from "./money.pipe";
import { PlatePipe } from "./plate.pipe";

@NgModule({
    declarations:[
    MoneyPipe,
    PlatePipe
    ],
    exports:[
    MoneyPipe,
    PlatePipe
    ]
    
})
export class AppPipeModule{}