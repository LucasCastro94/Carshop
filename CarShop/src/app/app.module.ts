import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { CoreModule } from './core/core.module';
import { CarroModule } from './carro/carro.module';
import { Error404 } from './core/component/404/error404.component';

@NgModule({
  declarations: [
    AppComponent,
    Error404
  ],
  imports: [
    BrowserModule,
    CoreModule,
    CarroModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path:'', redirectTo: 'carro',pathMatch: 'full'
      },
      {
        path:'**', component: Error404
      }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
