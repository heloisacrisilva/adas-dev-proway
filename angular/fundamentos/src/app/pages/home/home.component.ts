import { Component } from '@angular/core';
import { CardAlunoComponent } from '../../components/card-aluno/card-aluno.component';
import { GradeVerify } from '../../../utils/utils';
import { Aluno } from '../../interfaces/aluno';

@Component({
  selector: 'app-home',
  imports: [CardAlunoComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  title: string = 'Lista de alunos: ';
  modoExibicao: string = 'cards';
  alunos: Aluno[] = [
    {
      name: 'Heloisa C. da Silva',
      email: 'heloisa@mail.com',
      class: 'Adas Dev 8',
      grade: 8,
      status: GradeVerify(8),
      imageLink:
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEg6_hCRC5eERNRa0IKABVYgkvXSMGER60dIDeYnTILgRVc0eZUTmslog&s=10',
    },
    {
      name: 'Leonardo Marchioro',
      email: 'leonardo@mail.com',
      class: 'ADS',
      grade: 4,
      status: GradeVerify(4),
      imageLink:
        'https://comicvine.gamespot.com/a/uploads/square_small/6/66303/4469088-tumblr_inline_n0aleph3fl1r8rr6o.jpg',
    }
  ];
}
