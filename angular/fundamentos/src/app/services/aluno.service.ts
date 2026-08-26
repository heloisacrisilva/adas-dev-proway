import { Injectable } from '@angular/core';
import { Aluno } from '../interfaces/aluno';
import { GradeVerify } from '../../utils/utils';

//Engloba toda a lógica relaciona a alunos
@Injectable({
  providedIn: 'root',
})
export class AlunoService {
  modoExibicao: 'cards' | 'tabela' = 'cards';
  filtroAtual: 'TODOS' | 'APROVADOS' | 'REPROVADOS' = 'TODOS';
  alunosFiltrados: Aluno[] = [];
  private alunos: Aluno[] = [
    {
      name: 'Heloisa C. da Silva',
      idade: 21,
      email: 'heloisa@mail.com',
      class: 'Adas Dev 8',
      grade: 9,
      status: GradeVerify(9),
      imageLink:
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEg6_hCRC5eERNRa0IKABVYgkvXSMGER60dIDeYnTILgRVc0eZUTmslog&s=10',
    },
    {
      name: 'Leonardo Marchioro',
      idade: 24,
      email: 'leonardo@mail.com',
      class: 'ADS',
      grade: 9,
      status: GradeVerify(9),
      imageLink:
        'https://comicvine.gamespot.com/a/uploads/square_small/6/66303/4469088-tumblr_inline_n0aleph3fl1r8rr6o.jpg',
    },
    {
      name: 'Fulano Beltrano',
      idade: 15,
      email: 'fulano@mail.com',
      class: 'Marketing',
      grade: 4,
      status: GradeVerify(4),
      imageLink:
        'https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest?cb=20250817060829',
    },
  ];

  listar(): Aluno[] {
    return this.alunos;
  }

  aplicarFiltro(filtro: 'TODOS' | 'APROVADOS' | 'REPROVADOS'): void {
    this.filtroAtual = filtro;

    if (filtro === 'TODOS') {
      this.alunosFiltrados = this.alunos;
      return;
    }

    const status = filtro === 'APROVADOS' ? 'APROVADO' : 'REPROVADO';

    this.alunosFiltrados = this.alunos.filter(
      (aluno) => aluno.status === status,
    );
  }

  trocarVisualicacao(): void {
    this.modoExibicao = this.modoExibicao === 'cards' ? 'tabela' : 'cards';
  }

  quantidadeAlunos(): number {
    return this.alunos.length;
  }

  quantidadeAprovados(): number {
    return this.alunos.filter((aluno) => aluno.status === 'APROVADO').length;
  }

  quantidadeReprovados(): number {
    return this.alunos.filter((aluno) => aluno.status === 'REPROVADO').length;
  }

  maioresDeIdade(): number {
    return this.alunos.filter((aluno) => aluno.idade >= 18).length;
  }
}
