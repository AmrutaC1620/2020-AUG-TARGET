import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


const endpointUrl = 'http://localhost:3100/api/products';
// const endpointUrl = 'http://www.omdbapi.com/?s=iron&apikey=aa9e49f';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  products = [];

  constructor(private service: HttpClient){}

  ngOnInit() {
    this.service.get(endpointUrl)
    .subscribe(resp=>{
      this.products = resp as Array<any>;
    })
  }
  
}
