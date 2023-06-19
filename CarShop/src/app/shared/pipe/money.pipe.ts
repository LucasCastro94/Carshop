import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'money'
})
export class MoneyPipe implements PipeTransform{
    transform(value:number) {

    return "R$ "+ value.toString().replace(/\./g, '').replace(/\B(?=(\d{3})+(?!\d))/g, '.');

    }
}