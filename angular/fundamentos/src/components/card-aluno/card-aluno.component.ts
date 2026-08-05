import { Component } from '@angular/core';

function gradeVerify(grade: number) {
  if (grade >= 6) {
    return 'APROVADO';
  } else {
    return 'REPROVADO';
  }
}

@Component({
  selector: 'app-card-aluno',
  imports: [],
  templateUrl: './card-aluno.component.html',
  styleUrl: './card-aluno.component.css',
})
export class CardAlunoComponent {
  aluno1 = {
    name: 'Heloisa C. da Silva',
    email: 'heloisa@mail.com',
    class: 'Adas Dev 8',
    grade: 8,
    approved: gradeVerify(8),
    imageLink:
      'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEg6_hCRC5eERNRa0IKABVYgkvXSMGER60dIDeYnTILgRVc0eZUTmslog&s=10',
  };
  aluno2 = {
    name: 'Leonardo Marchioro',
    email: 'leonardo@mail.com',
    class: 'ADS',
    grade: 9,
    approved: gradeVerify(9),
    imageLink:
      'https://comicvine.gamespot.com/a/uploads/square_small/6/66303/4469088-tumblr_inline_n0aleph3fl1r8rr6o.jpg',
  };
}
