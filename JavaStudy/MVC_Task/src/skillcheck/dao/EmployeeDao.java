package skillcheck.dao;

import skillcheck.bean.EmployeeBean;
import skillcheck.bean.ResponseBean;
import skillcheck.exception.MVCException;

/**
 * インターフェース（DAO）
 *処理なしのメソッドを記述したクラス
 *
 * @author y.sato
 * @since 2019/01/02
 */
public interface EmployeeDao {

    /**
     * ExecuteCaseメソッド: 処理フラグ
     *オンかオフのどちらか
     * <pre>
     * {@code
     * ALL 全件
     * FIND_BY_EMPID 社員番号（完全一致
     * FIND_BY_EMPID_WITH_LIKE 社員番号（前後方一致}
     * </pre>
     */
	//Enum(列挙型)とは、複数の定数をひとつにまとめておくことができる型のこと。
    public enum ExecuteCase {
        FIND_ALL,
        FIND_BY_EMPID,
        FIND_BY_EMPID_WITH_LIKE
    }

    /**
     * 社員情報取得処理①（オーバロード）
     *
     * @return responseBean <pre>レスポンスデータ（社員情報データ／メッセージ）</pre>
     * @throws MVCException
     */
    public ResponseBean getEmployeeData(final ExecuteCase eCase) throws MVCException;

    /**
     * 社員情報取得処理②（オーバロード）
     *
     * @param ExecuteCase <pre>完全一致 or 前後方一致</pre>
     * @param empId <pre>検索条件となる社員番号</pre>
     * @return responseBean <pre>レスポンスデータ（社員情報データ／メッセージ）</pre>
     * @throws MVCException
     */
    public ResponseBean getEmployeeData(final ExecuteCase eCase, final EmployeeBean pEmployeeBean) throws MVCException;

}