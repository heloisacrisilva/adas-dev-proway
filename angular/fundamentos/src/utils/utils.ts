export function GradeVerify(grade: number) {
  if (grade >= 6) {
    return 'APROVADO';
  } else {
    return 'REPROVADO';
  }
}