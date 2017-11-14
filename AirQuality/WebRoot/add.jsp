<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>My JSP 'add.jsp' starting page</title>
</head>

<body>
	<form action="addAir" method="post">
		<table>
			<th colspan="2">添加空气质量信息</th>
			<tr>
				<td>检测区域:</td>
				<td><select name="district_id">
						<option value=0>请选择</option>
						<option value=1>西城区</option>
						<option value=2>东城区</option>
						<option value=3>海淀区</option>
						<option value=4>朝阳区</option>
						<option value=5>丰台区</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>检测日期:</td>
				<td><input type="text" name="monitor_time" />
				</td>
			</tr>
			<tr>
				<td>PM10值:</td>
				<td><input type="text" name="pm10" /></td>
			</tr>
			<tr>
				<td>PM2.5值:</td>
				<td><input type="text" name="pm25" /></td>
			</tr>
			<tr>
				<td>监测站:</td>
				<td><input type="text" name="monitoring_station" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存" /><input type="reset" /><input
					type="button" value="返回" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
