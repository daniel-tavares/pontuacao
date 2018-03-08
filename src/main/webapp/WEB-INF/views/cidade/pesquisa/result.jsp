<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:if test="${!empty cidades}">
	<table class="table table-hover">
		<thead class="thead-light">
			<tr>
				<td  scope="col">Estado</td>
				<td  scope="col">Cidade</td>
				<td  scope="col"></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cidades}" var="cidade" varStatus="status">
				<tr scope="row">
					<td><span id="estado${status.index}">${cidade.estado}</span></td>
					<td><span id="cidade${status.index}">${cidade.nome}</span></td>
					<td>
						<a onClick="pontos(${status.index})" href="#">Ver pontuação</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>
<c:if test="${empty cidades}">
   	<p>Não foi encontrado resultado para a sua pesquisa.</p>
</c:if>