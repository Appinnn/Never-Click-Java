package java0709;

public class ObjectArray2 {

	public static void main(String[] args) 
	{
		Game[] gm = new Game[7];
		
		gm[0] = new Game("���׿��극����","MOBA","PC");
		gm[1] = new Game("�������","FPS","PC");
		gm[2] = new Game("�����ý��丮","MMORPG","PC");
		gm[3] = new Game("������ ����: �߻��� ����","�׼�/��庥ó","Switch,WiiU");
		gm[4] = new Game("��Ű��","���� �׼�","Android/IOS");
		gm[5] = new Game("��Ÿũ����Ʈ1","RTS","PC");
		gm[6] = new Game("��ƺ��4","�׼� RPG","PC");
		
		for( int i=0; i< gm.length; i++ )
		{
			System.out.println(gm[i]);
		}

	}

}
// 7���� ���������� ����
// ��ü�� ���� �ϰ� ����ϼ���
