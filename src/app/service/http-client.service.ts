import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../admin/model/User';

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient: HttpClient

  ) {
  }

  getUsers() {
    return this.httpClient.get<User[]>('http://localhost:8080/users/get');

  }

}




