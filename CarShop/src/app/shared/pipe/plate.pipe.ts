import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'plate'
})
export class PlatePipe implements PipeTransform{

    transform(value:string) {

        return value.replace(/(.{3})/, '$1-').toLocaleUpperCase();

    }
}