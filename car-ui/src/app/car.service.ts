import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CarService {

  public API = '//localhost:8080';
  public carApi = '//localhost:8080/cars';

  constructor(private http: HttpClient) { }


  getAll(): Observable<any>{
    return this.http.get(this.carApi);
  }

  get(id: string){
   return this.http.get(this.carApi + '/' + id);
 }

 save(car: any){
   return  this.http.post(this.carApi, car);
 }
 remove(id: string){
    return this.http.delete(this.carApi + '/' + id);
  }

}
