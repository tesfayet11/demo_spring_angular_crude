import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { ListusersComponent } from './components/listusers/listusers.component';
import { UserComponent } from './components/user/user.component';
import { UserFormComponent } from './components/user-form/user-form.component';

const appRoutes :Routes =[
  {path:'',component: ListusersComponent},
  {path:'op',component: UserFormComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    ListusersComponent,
    UserComponent,
    UserFormComponent
  ],
  imports: [
    BrowserModule, RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
