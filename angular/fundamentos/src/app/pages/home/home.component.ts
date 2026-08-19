import { Component, inject } from '@angular/core';
import { CardAlunoComponent } from '../../components/card-aluno/card-aluno.component';
import { TabelaAlunosComponent } from '../../components/tabela-alunos/tabela-alunos.component';
import { GradeVerify } from '../../../utils/utils';
import { Aluno } from '../../interfaces/aluno';
import { AlunoService } from '../../services/aluno.service';

@Component({
  selector: 'app-home',
  imports: [CardAlunoComponent, TabelaAlunosComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {

  private readonly alunoService = inject(AlunoService)

  modoExibicao: string = 'cards';
  filtroAtual: string = 'TODOS';

  alunosFiltrados: Aluno[] = []

  //Chamada sempre que o componente é montado
  ngOnInit(): void {
    this.alunosFiltrados = this.alunoService.listar()
  }

  // aplicarFiltro(filtro: string) {
  //   this.filtroAtual = filtro;

  //   if (filtro === 'TODOS') {
  //     this.alunosFiltrados = this.alunos;
  //     return;
  //   }

  //   if (filtro === 'APROVADOS') {
  //     this.alunosFiltrados = this.alunos.filter((aluno) => aluno.status === 'APROVADO');
  //     return;
  //   }

  //   this.alunosFiltrados = this.alunos.filter((aluno) => aluno.status === 'REPROVADO');
  // }

  // trocarVisualicacao(): void {
  //   if (this.modoExibicao === 'cards') {
  //     this.modoExibicao = 'tabela'
  //     return
  //   } else {
  //     this.modoExibicao = 'cards'
  //     return
  //   }
  // }
}
