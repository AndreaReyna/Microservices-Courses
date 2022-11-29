import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CoursesComponent } from './components/courses/courses.component';
import { StudentsComponent } from './components/students/students.component';
import { TestsComponent } from './components/tests/tests.component';

const routes: Routes = [
  {path:'', pathMatch:'full', redirectTo: 'courses'},
  {path: 'students', component:StudentsComponent},
  {path: 'courses', component:CoursesComponent},
  {path: 'tests', component:TestsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }