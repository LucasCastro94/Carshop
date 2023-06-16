import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Carro } from "./carro";

@Injectable({
    providedIn:'root'
})
export class CarroService{

    private carroUrl:string = 'http://localhost:8080/api/v1/carros'

    constructor(private httpClient:HttpClient){}

    listAll() : Observable<Carro[]>{
        return this.httpClient.get<Carro[]>(this.carroUrl)
    }

    findById(id:number) : Observable<Carro>{
        return this.httpClient.get<Carro>(`${this.carroUrl}/${id}`)
    }

    save(carro:Carro) : Observable<Carro>{
        if(carro.id)
        {
            return this.httpClient.put<Carro>(`${this.carroUrl}/${carro.id}`,carro)
        }
        return this.httpClient.post<Carro>(`${this.carroUrl}`,carro)
    }

    deleteById(id:number) : Observable<any>{
        return this.httpClient.delete<any>(`${this.carroUrl}/${id}`)
    }


}