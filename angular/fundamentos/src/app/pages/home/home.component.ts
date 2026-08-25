import { Component, inject } from '@angular/core';
import { CardAlunoComponent } from '../../components/card-aluno/card-aluno.component';
import { TabelaAlunosComponent } from '../../components/tabela-alunos/tabela-alunos.component';
import { AlunoService } from '../../services/aluno.service';
import { Aluno } from '../../interfaces/aluno';

@Component({
  selector: 'app-home',
  imports: [CardAlunoComponent, TabelaAlunosComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  private readonly alunoService = inject(AlunoService);
  get alunosFiltrados() {
    return this.alunoService.alunosFiltrados;
  }

  get modoExibicao() {
    return this.alunoService.modoExibicao;
  }

  //Função do Angular que é executada sempre que a página é carregada
  ngOnInit(): void {
    this.alunoService.alunosFiltrados = this.alunoService.listar();
  }

  aplicarFiltro(filtro: 'TODOS' | 'APROVADOS' | 'REPROVADOS'): void {
    this.alunoService.aplicarFiltro(filtro);
  }

  trocarVisualicacao(): void {
    this.alunoService.trocarVisualicacao();
  }
}
