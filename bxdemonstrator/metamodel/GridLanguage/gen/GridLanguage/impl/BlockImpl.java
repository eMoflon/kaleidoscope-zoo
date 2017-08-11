/**
 */
package GridLanguage.impl;

import GridLanguage.Block;
import GridLanguage.GridLanguagePackage;
import GridLanguage.Group;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GridLanguage.impl.BlockImpl#getXIndex <em>XIndex</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getYIndex <em>YIndex</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getS <em>S</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getN <em>N</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getE <em>E</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getW <em>W</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getNe <em>Ne</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getSw <em>Sw</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getNw <em>Nw</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getSe <em>Se</em>}</li>
 *   <li>{@link GridLanguage.impl.BlockImpl#getIsOccupiedBy <em>Is Occupied By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends EObjectImpl implements Block {
	/**
	 * The default value of the '{@link #getXIndex() <em>XIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int XINDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXIndex() <em>XIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXIndex()
	 * @generated
	 * @ordered
	 */
	protected int xIndex = XINDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getYIndex() <em>YIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int YINDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYIndex() <em>YIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYIndex()
	 * @generated
	 * @ordered
	 */
	protected int yIndex = YINDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected Block s;

	/**
	 * The cached value of the '{@link #getN() <em>N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN()
	 * @generated
	 * @ordered
	 */
	protected Block n;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected Block e;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected Block w;

	/**
	 * The cached value of the '{@link #getNe() <em>Ne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNe()
	 * @generated
	 * @ordered
	 */
	protected Block ne;

	/**
	 * The cached value of the '{@link #getSw() <em>Sw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSw()
	 * @generated
	 * @ordered
	 */
	protected Block sw;

	/**
	 * The cached value of the '{@link #getNw() <em>Nw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNw()
	 * @generated
	 * @ordered
	 */
	protected Block nw;

	/**
	 * The cached value of the '{@link #getSe() <em>Se</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSe()
	 * @generated
	 * @ordered
	 */
	protected Block se;

	/**
	 * The cached value of the '{@link #getIsOccupiedBy() <em>Is Occupied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOccupiedBy()
	 * @generated
	 * @ordered
	 */
	protected Group isOccupiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GridLanguagePackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXIndex() {
		return xIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXIndex(int newXIndex) {
		int oldXIndex = xIndex;
		xIndex = newXIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__XINDEX, oldXIndex,
					xIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYIndex() {
		return yIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYIndex(int newYIndex) {
		int oldYIndex = yIndex;
		yIndex = newYIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__YINDEX, oldYIndex,
					yIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getS() {
		if (s != null && s.eIsProxy()) {
			InternalEObject oldS = (InternalEObject) s;
			s = (Block) eResolveProxy(oldS);
			if (s != oldS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__S, oldS, s));
			}
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetS() {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS(Block newS, NotificationChain msgs) {
		Block oldS = s;
		s = newS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__S,
					oldS, newS);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(Block newS) {
		if (newS != s) {
			NotificationChain msgs = null;
			if (s != null)
				msgs = ((InternalEObject) s).eInverseRemove(this, GridLanguagePackage.BLOCK__N, Block.class, msgs);
			if (newS != null)
				msgs = ((InternalEObject) newS).eInverseAdd(this, GridLanguagePackage.BLOCK__N, Block.class, msgs);
			msgs = basicSetS(newS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__S, newS, newS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getN() {
		if (n != null && n.eIsProxy()) {
			InternalEObject oldN = (InternalEObject) n;
			n = (Block) eResolveProxy(oldN);
			if (n != oldN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__N, oldN, n));
			}
		}
		return n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetN() {
		return n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetN(Block newN, NotificationChain msgs) {
		Block oldN = n;
		n = newN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__N,
					oldN, newN);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN(Block newN) {
		if (newN != n) {
			NotificationChain msgs = null;
			if (n != null)
				msgs = ((InternalEObject) n).eInverseRemove(this, GridLanguagePackage.BLOCK__S, Block.class, msgs);
			if (newN != null)
				msgs = ((InternalEObject) newN).eInverseAdd(this, GridLanguagePackage.BLOCK__S, Block.class, msgs);
			msgs = basicSetN(newN, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__N, newN, newN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getE() {
		if (e != null && e.eIsProxy()) {
			InternalEObject oldE = (InternalEObject) e;
			e = (Block) eResolveProxy(oldE);
			if (e != oldE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__E, oldE, e));
			}
		}
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetE() {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetE(Block newE, NotificationChain msgs) {
		Block oldE = e;
		e = newE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__E,
					oldE, newE);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE(Block newE) {
		if (newE != e) {
			NotificationChain msgs = null;
			if (e != null)
				msgs = ((InternalEObject) e).eInverseRemove(this, GridLanguagePackage.BLOCK__W, Block.class, msgs);
			if (newE != null)
				msgs = ((InternalEObject) newE).eInverseAdd(this, GridLanguagePackage.BLOCK__W, Block.class, msgs);
			msgs = basicSetE(newE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__E, newE, newE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getW() {
		if (w != null && w.eIsProxy()) {
			InternalEObject oldW = (InternalEObject) w;
			w = (Block) eResolveProxy(oldW);
			if (w != oldW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__W, oldW, w));
			}
		}
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetW(Block newW, NotificationChain msgs) {
		Block oldW = w;
		w = newW;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__W,
					oldW, newW);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(Block newW) {
		if (newW != w) {
			NotificationChain msgs = null;
			if (w != null)
				msgs = ((InternalEObject) w).eInverseRemove(this, GridLanguagePackage.BLOCK__E, Block.class, msgs);
			if (newW != null)
				msgs = ((InternalEObject) newW).eInverseAdd(this, GridLanguagePackage.BLOCK__E, Block.class, msgs);
			msgs = basicSetW(newW, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__W, newW, newW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getNe() {
		if (ne != null && ne.eIsProxy()) {
			InternalEObject oldNe = (InternalEObject) ne;
			ne = (Block) eResolveProxy(oldNe);
			if (ne != oldNe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__NE, oldNe,
							ne));
			}
		}
		return ne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetNe() {
		return ne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNe(Block newNe, NotificationChain msgs) {
		Block oldNe = ne;
		ne = newNe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GridLanguagePackage.BLOCK__NE, oldNe, newNe);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNe(Block newNe) {
		if (newNe != ne) {
			NotificationChain msgs = null;
			if (ne != null)
				msgs = ((InternalEObject) ne).eInverseRemove(this, GridLanguagePackage.BLOCK__SW, Block.class, msgs);
			if (newNe != null)
				msgs = ((InternalEObject) newNe).eInverseAdd(this, GridLanguagePackage.BLOCK__SW, Block.class, msgs);
			msgs = basicSetNe(newNe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__NE, newNe, newNe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getSw() {
		if (sw != null && sw.eIsProxy()) {
			InternalEObject oldSw = (InternalEObject) sw;
			sw = (Block) eResolveProxy(oldSw);
			if (sw != oldSw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__SW, oldSw,
							sw));
			}
		}
		return sw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetSw() {
		return sw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSw(Block newSw, NotificationChain msgs) {
		Block oldSw = sw;
		sw = newSw;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GridLanguagePackage.BLOCK__SW, oldSw, newSw);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSw(Block newSw) {
		if (newSw != sw) {
			NotificationChain msgs = null;
			if (sw != null)
				msgs = ((InternalEObject) sw).eInverseRemove(this, GridLanguagePackage.BLOCK__NE, Block.class, msgs);
			if (newSw != null)
				msgs = ((InternalEObject) newSw).eInverseAdd(this, GridLanguagePackage.BLOCK__NE, Block.class, msgs);
			msgs = basicSetSw(newSw, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__SW, newSw, newSw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getNw() {
		if (nw != null && nw.eIsProxy()) {
			InternalEObject oldNw = (InternalEObject) nw;
			nw = (Block) eResolveProxy(oldNw);
			if (nw != oldNw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__NW, oldNw,
							nw));
			}
		}
		return nw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetNw() {
		return nw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNw(Block newNw, NotificationChain msgs) {
		Block oldNw = nw;
		nw = newNw;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GridLanguagePackage.BLOCK__NW, oldNw, newNw);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNw(Block newNw) {
		if (newNw != nw) {
			NotificationChain msgs = null;
			if (nw != null)
				msgs = ((InternalEObject) nw).eInverseRemove(this, GridLanguagePackage.BLOCK__SE, Block.class, msgs);
			if (newNw != null)
				msgs = ((InternalEObject) newNw).eInverseAdd(this, GridLanguagePackage.BLOCK__SE, Block.class, msgs);
			msgs = basicSetNw(newNw, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__NW, newNw, newNw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getSe() {
		if (se != null && se.eIsProxy()) {
			InternalEObject oldSe = (InternalEObject) se;
			se = (Block) eResolveProxy(oldSe);
			if (se != oldSe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__SE, oldSe,
							se));
			}
		}
		return se;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetSe() {
		return se;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSe(Block newSe, NotificationChain msgs) {
		Block oldSe = se;
		se = newSe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GridLanguagePackage.BLOCK__SE, oldSe, newSe);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSe(Block newSe) {
		if (newSe != se) {
			NotificationChain msgs = null;
			if (se != null)
				msgs = ((InternalEObject) se).eInverseRemove(this, GridLanguagePackage.BLOCK__NW, Block.class, msgs);
			if (newSe != null)
				msgs = ((InternalEObject) newSe).eInverseAdd(this, GridLanguagePackage.BLOCK__NW, Block.class, msgs);
			msgs = basicSetSe(newSe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__SE, newSe, newSe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getIsOccupiedBy() {
		if (isOccupiedBy != null && isOccupiedBy.eIsProxy()) {
			InternalEObject oldIsOccupiedBy = (InternalEObject) isOccupiedBy;
			isOccupiedBy = (Group) eResolveProxy(oldIsOccupiedBy);
			if (isOccupiedBy != oldIsOccupiedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridLanguagePackage.BLOCK__IS_OCCUPIED_BY,
							oldIsOccupiedBy, isOccupiedBy));
			}
		}
		return isOccupiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetIsOccupiedBy() {
		return isOccupiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOccupiedBy(Group newIsOccupiedBy, NotificationChain msgs) {
		Group oldIsOccupiedBy = isOccupiedBy;
		isOccupiedBy = newIsOccupiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GridLanguagePackage.BLOCK__IS_OCCUPIED_BY, oldIsOccupiedBy, newIsOccupiedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOccupiedBy(Group newIsOccupiedBy) {
		if (newIsOccupiedBy != isOccupiedBy) {
			NotificationChain msgs = null;
			if (isOccupiedBy != null)
				msgs = ((InternalEObject) isOccupiedBy).eInverseRemove(this, GridLanguagePackage.GROUP__OCCUPIES,
						Group.class, msgs);
			if (newIsOccupiedBy != null)
				msgs = ((InternalEObject) newIsOccupiedBy).eInverseAdd(this, GridLanguagePackage.GROUP__OCCUPIES,
						Group.class, msgs);
			msgs = basicSetIsOccupiedBy(newIsOccupiedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.BLOCK__IS_OCCUPIED_BY,
					newIsOccupiedBy, newIsOccupiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GridLanguagePackage.BLOCK__S:
			if (s != null)
				msgs = ((InternalEObject) s).eInverseRemove(this, GridLanguagePackage.BLOCK__N, Block.class, msgs);
			return basicSetS((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__N:
			if (n != null)
				msgs = ((InternalEObject) n).eInverseRemove(this, GridLanguagePackage.BLOCK__S, Block.class, msgs);
			return basicSetN((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__E:
			if (e != null)
				msgs = ((InternalEObject) e).eInverseRemove(this, GridLanguagePackage.BLOCK__W, Block.class, msgs);
			return basicSetE((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__W:
			if (w != null)
				msgs = ((InternalEObject) w).eInverseRemove(this, GridLanguagePackage.BLOCK__E, Block.class, msgs);
			return basicSetW((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__NE:
			if (ne != null)
				msgs = ((InternalEObject) ne).eInverseRemove(this, GridLanguagePackage.BLOCK__SW, Block.class, msgs);
			return basicSetNe((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__SW:
			if (sw != null)
				msgs = ((InternalEObject) sw).eInverseRemove(this, GridLanguagePackage.BLOCK__NE, Block.class, msgs);
			return basicSetSw((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__NW:
			if (nw != null)
				msgs = ((InternalEObject) nw).eInverseRemove(this, GridLanguagePackage.BLOCK__SE, Block.class, msgs);
			return basicSetNw((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__SE:
			if (se != null)
				msgs = ((InternalEObject) se).eInverseRemove(this, GridLanguagePackage.BLOCK__NW, Block.class, msgs);
			return basicSetSe((Block) otherEnd, msgs);
		case GridLanguagePackage.BLOCK__IS_OCCUPIED_BY:
			if (isOccupiedBy != null)
				msgs = ((InternalEObject) isOccupiedBy).eInverseRemove(this, GridLanguagePackage.GROUP__OCCUPIES,
						Group.class, msgs);
			return basicSetIsOccupiedBy((Group) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GridLanguagePackage.BLOCK__S:
			return basicSetS(null, msgs);
		case GridLanguagePackage.BLOCK__N:
			return basicSetN(null, msgs);
		case GridLanguagePackage.BLOCK__E:
			return basicSetE(null, msgs);
		case GridLanguagePackage.BLOCK__W:
			return basicSetW(null, msgs);
		case GridLanguagePackage.BLOCK__NE:
			return basicSetNe(null, msgs);
		case GridLanguagePackage.BLOCK__SW:
			return basicSetSw(null, msgs);
		case GridLanguagePackage.BLOCK__NW:
			return basicSetNw(null, msgs);
		case GridLanguagePackage.BLOCK__SE:
			return basicSetSe(null, msgs);
		case GridLanguagePackage.BLOCK__IS_OCCUPIED_BY:
			return basicSetIsOccupiedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GridLanguagePackage.BLOCK__XINDEX:
			return getXIndex();
		case GridLanguagePackage.BLOCK__YINDEX:
			return getYIndex();
		case GridLanguagePackage.BLOCK__S:
			if (resolve)
				return getS();
			return basicGetS();
		case GridLanguagePackage.BLOCK__N:
			if (resolve)
				return getN();
			return basicGetN();
		case GridLanguagePackage.BLOCK__E:
			if (resolve)
				return getE();
			return basicGetE();
		case GridLanguagePackage.BLOCK__W:
			if (resolve)
				return getW();
			return basicGetW();
		case GridLanguagePackage.BLOCK__NE:
			if (resolve)
				return getNe();
			return basicGetNe();
		case GridLanguagePackage.BLOCK__SW:
			if (resolve)
				return getSw();
			return basicGetSw();
		case GridLanguagePackage.BLOCK__NW:
			if (resolve)
				return getNw();
			return basicGetNw();
		case GridLanguagePackage.BLOCK__SE:
			if (resolve)
				return getSe();
			return basicGetSe();
		case GridLanguagePackage.BLOCK__IS_OCCUPIED_BY:
			if (resolve)
				return getIsOccupiedBy();
			return basicGetIsOccupiedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GridLanguagePackage.BLOCK__XINDEX:
			setXIndex((Integer) newValue);
			return;
		case GridLanguagePackage.BLOCK__YINDEX:
			setYIndex((Integer) newValue);
			return;
		case GridLanguagePackage.BLOCK__S:
			setS((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__N:
			setN((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__E:
			setE((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__W:
			setW((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__NE:
			setNe((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__SW:
			setSw((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__NW:
			setNw((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__SE:
			setSe((Block) newValue);
			return;
		case GridLanguagePackage.BLOCK__IS_OCCUPIED_BY:
			setIsOccupiedBy((Group) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GridLanguagePackage.BLOCK__XINDEX:
			setXIndex(XINDEX_EDEFAULT);
			return;
		case GridLanguagePackage.BLOCK__YINDEX:
			setYIndex(YINDEX_EDEFAULT);
			return;
		case GridLanguagePackage.BLOCK__S:
			setS((Block) null);
			return;
		case GridLanguagePackage.BLOCK__N:
			setN((Block) null);
			return;
		case GridLanguagePackage.BLOCK__E:
			setE((Block) null);
			return;
		case GridLanguagePackage.BLOCK__W:
			setW((Block) null);
			return;
		case GridLanguagePackage.BLOCK__NE:
			setNe((Block) null);
			return;
		case GridLanguagePackage.BLOCK__SW:
			setSw((Block) null);
			return;
		case GridLanguagePackage.BLOCK__NW:
			setNw((Block) null);
			return;
		case GridLanguagePackage.BLOCK__SE:
			setSe((Block) null);
			return;
		case GridLanguagePackage.BLOCK__IS_OCCUPIED_BY:
			setIsOccupiedBy((Group) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GridLanguagePackage.BLOCK__XINDEX:
			return xIndex != XINDEX_EDEFAULT;
		case GridLanguagePackage.BLOCK__YINDEX:
			return yIndex != YINDEX_EDEFAULT;
		case GridLanguagePackage.BLOCK__S:
			return s != null;
		case GridLanguagePackage.BLOCK__N:
			return n != null;
		case GridLanguagePackage.BLOCK__E:
			return e != null;
		case GridLanguagePackage.BLOCK__W:
			return w != null;
		case GridLanguagePackage.BLOCK__NE:
			return ne != null;
		case GridLanguagePackage.BLOCK__SW:
			return sw != null;
		case GridLanguagePackage.BLOCK__NW:
			return nw != null;
		case GridLanguagePackage.BLOCK__SE:
			return se != null;
		case GridLanguagePackage.BLOCK__IS_OCCUPIED_BY:
			return isOccupiedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xIndex: ");
		result.append(xIndex);
		result.append(", yIndex: ");
		result.append(yIndex);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //BlockImpl
